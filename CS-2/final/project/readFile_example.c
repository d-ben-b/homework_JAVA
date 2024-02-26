/*
* File Name: read_example.c
* Editor: StaryCheng
* Description: This program provides an example for reading the content
* of a specified text file through the function "char* readFile(char *filename)"
*/

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char* readFile(char *filename);

int main()
{
    char *filename = "test.txt";
    char *filecontent = readFile(filename);
    
    printf("Content of %s:\n%s",filename, filecontent);
    /*
    *   readFile(filename): retrieve the address of the string that contains the contents
    *   filename: point to the address of the read text file name
    *
    */
}
char* readFile(char *filename)
{
    /*
    * Input: absolute file path (file name if it is in the same directory with the file)
    * Ouput: contents of the file
    * Read the whole content of a specified file with its name and return the content
    * as a string pointer
    *
    *
    */
    
    FILE *fp;
    char temp[1000];
    char *return_string = "";
    fp = fopen(filename, "r");
    
    if (fp == NULL){
        printf("Can't open file\n");

    }

    char *temp3 = "";
    
    while(fgets(temp, 1000, fp)!=NULL)
    {
        return_string = malloc((strlen(temp)+strlen(return_string)+1)*sizeof(char));
        strcpy(return_string,temp3);
        temp3 = malloc((strlen(temp)+strlen(temp3)+1)*sizeof(char));
        strcat(return_string,temp);
        strcpy(temp3,return_string);
    }
    fclose(fp);
    return return_string;
}

