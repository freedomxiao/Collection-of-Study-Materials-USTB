src += Glob('*.cpp')
 
paths = ['./']

env = Environment () 
  
env.Append(CPPPATH=paths)
env.Append(CCCOMSTR="CC $SOURCES")

obj =env.Object(src)  
 
Return('obj')
