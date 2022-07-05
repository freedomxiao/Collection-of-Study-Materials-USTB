#include<iostream>
using namespace std;

class 课堂 : public 课程
{
  private: 
    string 时间;
    string 地点;
  public:
    课堂(){}
    课堂(string 时间,string 地点){
        
        this.时间 = 时间;
        this.地点 = 地点;
    }       
    
    void get时间(){
        return 时间;
    }
    void get地点(){
        return 地点;
    }
    
    void set时间(string 时间){
        this.时间=时间;
    }
    void set地点(string 地点){
        this.地点=地点;
    }
}