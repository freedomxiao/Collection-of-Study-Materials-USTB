#include<iostream>
using namespace std;

class {{ClassName}} {{BaseClassName}}
{
  {% if Len!=0 -%}private: {% endif -%}
    {% for attribute in Attributes %}
    string {{ attribute }};
    {%- endfor %}
  public:
    {{ClassName}}(){}
    {% if Len!=0 -%}{{ClassName}}({% for attribute in Attributes %}{% if attribute!=Attributes[0] -%},{% endif -%}string {{ attribute }}{%- endfor %}){
        {% for attribute in Attributes %}
        this.{{ attribute }} = {{ attribute }};   {%- endfor %}
    }{% endif -%}

    {% for operation in Operations %}
    void {{operation}}(){ }
    {%- endfor %}       
    {% for attribute in Attributes %}
    void get{{ attribute }}(){
        return {{attribute}};
    }
    {%- endfor %}
    {% for attribute in Attributes %}
    void set{{ attribute }}(string {{attribute}}){
        this.{{attribute}}={{attribute}};
    } {%- endfor %}
}