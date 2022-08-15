package com.example.android.myapplication;



public class student {

    private string studentName ;
    private int studentAge ;
    private int studentPhoto


            pup
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */


        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}