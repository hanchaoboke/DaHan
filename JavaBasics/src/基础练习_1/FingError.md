找错  
    void public main(){   //1     
    int i=1,j;  //   
    float f1=0.1;  //f  
	float f2=123;   //f  
	long  l1=123141L,l2=88888888888;  
	double d1=2e20,d2=124;  
	byte b1=1,b2=2,b3=129;  
	j=j+10;  
	i=i/10;  
	i=i*0.1;  
	char c1='a',c2=125;  
	byte b=b1-b2;  
    char c=c1+c2-1;     
    float f3=f1+f2;  
    float f4=f1+f2*0.1;  
    double d=d1*i+j;  
    float f=(float)(d1*5+d2);  
	}
	
声明byte型变量b3时，初始化的值是129，超过byte能表示的最大值127，错误

i和j两个变量，没有声明就直接使用

c2变量初始化错误


