判断代码是否有错误，如有，请修改。

float a = 2.1;

float b = (double)20.9;

int b3 = 210.9f +2.51;

int b4 = (int)20.9 + (int)2.51;


float b = (double)20.9;错误  
声明变量b是float型，初始化的时候强转成double型，类型冲突错误

int b3 = 210.9f +2.51;  
210.9f转换int型，精度会丢失



