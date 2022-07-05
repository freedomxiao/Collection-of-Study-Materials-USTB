import sys
import xml.etree.ElementTree as ET
from jinja2 import Environment, FileSystemLoader

tree = ET.parse('OOA.aquila')
root = tree.getroot()
templateEnv = Environment(loader=FileSystemLoader('.'))
template = templateEnv.get_template("/BaseClassTemplate.tpl")
# for child in root:
#     print(child.tag, child.attrib)

#print(root[0].attrib)


for ele in root.findall('elements'):
    print(ele.get('name')," ",end="")
    classname=ele.get('name')
    
    #所继承的父类（只考虑公有继承）
    if(ele.attrib.get('superTypes')):
        strs=ele.attrib.get('superTypes').split(".")
        print(root[int(strs[1])].attrib.get('name'))
        baseClassName=': public '+root[int(strs[1])].attrib.get('name')
    else: 
        print()
        baseClassName=''
   # name = ele.get(name)
   # print(name.text)

    #所拥有的属性（默认为私有属性）
    attributes=[]
    operations=[]
    referattributes=[]
    for char in ele.findall('structuralFeatures'):
        if(char.get('name')!='ref'):
            print(' |-->', char.get('name'),'(attribute)')
            attributes.append(char.get('name'))
        else:
            strs1=char.get('referenceType').split(".")
            print(' |-->', root[int(strs1[1])].attrib.get('name'),'(REattribute)')
            referattributes.append(root[int(strs1[1])].attrib.get('name')+"[]")
    #所拥有的行为（默认为公有）
    for char in ele.findall('operations'):
        print(' |-->', char.get('name'),'(operations)')
        operations.append(char.get('name'))
    
    templateVars = {"ClassName": classname,
                    "BaseClassName":baseClassName,
                    "Len":len(attributes)+len(referattributes),
                    "Attributes":attributes+referattributes,
                    #"Referattributes":referattributes,
                    "Operations":operations
                    }
    outputText = template.render(templateVars)
    filename=classname+".cpp"
    with open("./"+filename, "w") as f:
        f.write(outputText)