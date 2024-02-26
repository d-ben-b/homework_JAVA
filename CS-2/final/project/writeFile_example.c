/*
* File Name: write_example.c
* Editor: SeanWeng
* Description: This program provides an example for writing the content
* into a specified text file through the function "void writeFile(char* String)"
*/

#include<stdlib.h>
#include<stdio.h>
#include<string.h>

void writeFile(char *filename, char *content);

int main()
{
    char *filename = "test.txt";
    char *content = "Hello";
    writeFile(filename, content);
    /*
    *   writeFile(filename, filecontent): 
    *   filename: point to the address of the write text file name
    *   filecontent: point to the address of the content
    *
    */
    return 0;
}

void writeFile(char *filename, char *content)
{
    /*
    * Input: absolute file path (file name if it is in the same directory with the file),
    *        content of the file
    * Write the content into a specified file
    *
    *
    */
    FILE *fp;
    fp = fopen(filename,"a");
    fprintf(fp,content);
    fclose(fp);

}
