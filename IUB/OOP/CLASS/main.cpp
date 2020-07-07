//lab 1
/*
#include<cmath>
#include<iostream>

using namespace std;

//prototype
void doAnother(int);

//function with definition
void doSome(){
    cout<<"Doing some..."<<endl;
}

//function call. There MUST be a caller of a function. The caller is also a function
int main(){

	cout<<pow(2,3)<<endl;
	doSome();
	doAnother(20);
	pow(3,2);
	return 0;
}

void doAnother(int x){
    cout<<"x="<<x<<endl;
	//code to execute. do something with x
}
*/

//--------------------------------------------

//Complete the following code

#include <iostream>
#include <cstdlib>
using namespace std;

//put definition of calcAvg here

float calcAvg(int a,float b) {
return (a+b)/2;
}
int getRandom (int);
int main(){
    int x=10, y; float z;

    z = calcAvg(x, y=getRandom(100));
    cout<<"x="<<x<<", y="<<y<<", Avg="<<z<<endl;
    return 0;
}
//put definition of getRandom here

int getRandom( int y) {
y = rand() % 100 + 1;
return y;
}
