#include<iostream>
using namespace std;

double f(double x); //�����v�Z����֐��A�߂�l�͌v�Z����



int main()
{
	double a, b,div;
	double x, h;

	double kukan = 0, daikei = 0, symp = 0;//�e�v�Z���@�̓�����ۑ�����ϐ�

	//�K�v�ȏ��̓���
	cout << "�ϕ��J�n�ʒu a �̓��́���" ;
	cin >> a;
	cout << "�ϕ��I���ʒu b �̓��́���" ;
	cin >> b;
	cout << "������ �̓��́���" ;
	cin >> div;

	h = (b - a) / div; //�������ɂ��͈�h�̓��o

	cout << "����h:" << h << endl;

	for (x = a; x <= b; x += h) {//�͈͂�a����b�܂łŊԊu��h
		kukan += f(x)*h;
		if (x != 0) {
			daikei += (f(x) + f(x - h)) * (h / 2);
		}
	}


	cout << "��Ԗ@�̌v�Z����: " << kukan << " �������Ƃ̍�: " << (atan(b) - atan(a)) - kukan << endl;
	cout << "��`�@�̌v�Z����: " << daikei << " �������Ƃ̍�: " <<(atan(b) - atan(a)) - daikei << endl;



}


double f(double x) {
	double ans;

	ans = 1 / (1 + (x*x) ); 

	return ans;
}


//int input, input2;
//int ans;
//cout << "���������͂��Ă��������B" << endl;
//cin >> input;
//cout << "������2����͂��Ă��������B" << endl;
//cin >> input2;
//cout << input2 << "�Ɠ��͂���܂����B" << endl;
//
//cout << "������" << input + input2 << endl;
//
//return 0;