package class_implementation;

public class University extends Student{
private String major;
public University(String _name, int _year, String _major) {
System.out.println("Call University Constructor");
name = _name;
year = _year;
major = _major;
}
public String getMajor(){
return major;}}