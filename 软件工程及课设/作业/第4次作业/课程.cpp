#include<iostream>
using namespace std;

class 课程 
{
  private: 
    string class_id;
    string 学生[];
  public:
    课程(){}
    课程(string class_id,string 学生[]){
        
        this.class_id = class_id;
        this.学生[] = 学生[];
    }       
    
    void getclass_id(){
        return class_id;
    }
    void get学生[](){
        return 学生[];
    }
    
    void setclass_id(string class_id){
        this.class_id=class_id;
    }
    void set学生[](string 学生[]){
        this.学生[]=学生[];
    }
}