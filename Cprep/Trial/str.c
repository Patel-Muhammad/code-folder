#include <stdio.h>

struct student{
    int roll;
    float cgpa;
    char name[100];
};

void main(){
    struct student s1;
    s1.name = "Muhammad";
    s1.cgpa = 7.04;
    s1.roll = 3;

}