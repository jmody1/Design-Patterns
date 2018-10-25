Assuming you are in the directory containing this README:
## To clean:
ant -buildfile src/build.xml clean
-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all
-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND -Darg2=THIRD
-----------------------------------------------------------------------
## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf 
divya_kharbanda_jimit_mody_assign5.tar.gz divya_kharbanda_jimit_mody_assign5
-----------------------------------------------------------------------
"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to nyone else. I understand that if I am involved in plagiarism or cheating I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will receive a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense.

Validation on command Line arguements:
- I have checked the number of arguements
- I have checked validation on name of input file
- Checked the range of debug level

Pattern Used: Strategy Pattern
We have the tree without using any pattern and for the implementation of different checks, we have used strategy pattern, as we are working on same data each time and we found it most suitable according the problem given. 

[8/03/2018]
-----------------------------------------------------------------------

I took the reference on how to read and write the file, and URl for the same is Mentioned below
https://coderanch.com/t/527038/java/Reading-text-file-FileReader-BufferedReader

I took reference for implementation of insertion of values in BST:
http://www.baeldung.com/java-binary-tree
