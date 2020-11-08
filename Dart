import 'dart:io';
void main(){
  int num1,num2;
  double num3;

  num1 = int.parse(stdin.readLineSync());
  num2 = int.parse(stdin.readLineSync());
  num3 = double.parse(stdin.readLineSync());

  double mul = num2 * num3;
  var num = mul.toStringAsFixed(2);
  print("NUMBER = $num1");
  print("SALARY = U\$ $num");
}
