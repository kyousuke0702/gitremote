#include<iostream>
using namespace std;

double f(double x); //式を計算する関数、戻り値は計算結果



int main()
{
	double a, b,div;
	double x, h;

	double kukan = 0, daikei = 0, symp = 0;//各計算方法の答えを保存する変数

	//必要な情報の入力
	cout << "積分開始位置 a の入力＞＞" ;
	cin >> a;
	cout << "積分終了位置 b の入力＞＞" ;
	cin >> b;
	cout << "分割数 の入力＞＞" ;
	cin >> div;

	h = (b - a) / div; //分割数による範囲hの導出

	cout << "距離h:" << h << endl;

	for (x = a; x <= b; x += h) {//範囲はaからbまでで間隔がh
		kukan += f(x)*h;
		if (x != 0) {
			daikei += (f(x) + f(x - h)) * (h / 2);
		}
	}


	cout << "区間法の計算結果: " << kukan << " 厳密解との差: " << (atan(b) - atan(a)) - kukan << endl;
	cout << "台形法の計算結果: " << daikei << " 厳密解との差: " <<(atan(b) - atan(a)) - daikei << endl;



}


double f(double x) {
	double ans;

	ans = 1 / (1 + (x*x) ); 

	return ans;
}


//int input, input2;
//int ans;
//cout << "文字列を入力してください。" << endl;
//cin >> input;
//cout << "文字列2を入力してください。" << endl;
//cin >> input2;
//cout << input2 << "と入力されました。" << endl;
//
//cout << "答えは" << input + input2 << endl;
//
//return 0;