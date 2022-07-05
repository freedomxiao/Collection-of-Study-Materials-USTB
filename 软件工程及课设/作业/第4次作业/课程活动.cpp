#include<iostream>
using namespace std;

class 课程活动 
{
  private: 
    string 测验;
    string 作业;
  public:
    课程活动(){}
    课程活动(string 测验,string 作业){
        
        this.测验 = 测验;
        this.作业 = 作业;
    }
    void 开启(){ }
    void 关闭(){ }       
    
    void get测验(){
        return 测验;
    }
    void get作业(){
        return 作业;
    }
    
    void set测验(string 测验){
        this.测验=测验;
    }
    void set作业(string 作业){
        this.作业=作业;
    }
}