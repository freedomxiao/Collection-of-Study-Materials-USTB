#include<iostream>
using namespace std;

class person 
{
  private: 
    string id;
  public:
    person(){}
    person(string id){
        
        this.id = id;
    }       
    
    void getid(){
        return id;
    }
    
    void setid(string id){
        this.id=id;
    }
}