#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void show_chess();
void save();
void save_bridge();
void getteam(char team);
void readfile_chess();
void readfile_bridge();
void show_bridge();
void read_step();
int chess_strategy();
int type(int i,int j);
void bridge_block();
int bridge_strategy();
void show_chess_and_bridge();
void bridge_island();
void write_bridge(int i,int j);
void clear();

static char chess[200] = {"chess.txt"};
static char bridge[200] = {"bridge.txt"};
static char step[200] = {"stepLog.txt"};
static int chess_board[11][11] = {};
static int bridge_board[11][11] = {};
static char chess_and_bridge[11][11] = {};
static int team = 1;
static int enemy = 2;

int main(int argc, char *argv[])
{
    getteam(argv[1][0]);
    strcpy(chess,argv[3]);
    strcpy(bridge,argv[4]);
    strcpy(step,argv[5]);
    readfile_chess();
    readfile_bridge();
    read_step();
    bridge_block();
    if(0 == bridge_strategy())
    {
        chess_strategy();
    }
    clear();
    save();
    save_bridge();
    return 0;
}

void readfile_chess()
{
    int i = 0;
    int j = 0;
    char word;
    FILE *pfile = fopen(chess,"r");
    if (pfile == NULL)
    {
        printf("file not found!");
    }
    else
    {
         while(!feof(pfile))
        {
            word = (size_t)pfile;
            if(word != '\n')
            {
                fscanf(pfile,"%d,%d,%d,%d,%d,%d,%d,%d,%d,%d",&chess_board[j][i],&chess_board[j+1][i],&chess_board[j+2][i],&chess_board[j+3][i],&chess_board[j+4][i],&chess_board[j+5][i],&chess_board[j+6][i],&chess_board[j+7][i],&chess_board[j+8][i],&chess_board[j+9][i]);
                i++;
            }
        }
    }
for(i = 0; i < 10;i++)
{
    for(j = 0; j < 10; j++)
    {
        type(i,j);
    }
}
    show_chess();
    fclose(pfile);
}

void show_chess()
{
    int i,j;
    printf("chess:\n");
    for(i = 0;i < 10;i++)
    {
        for(j = 0;j < 10;j++)
        {
            printf("%d",chess_board[j][i]);
            if(j!= 9)
            {
                printf(",");
            }
        }
        printf("\n");
    }
}

void show_chess_and_bridge()
{
    int i,j;
    printf("chess_and_bridge:\n");
    for(i = 0;i < 10;i++)
    {
        for(j = 0;j < 10;j++)
        {
            printf("%c",chess_and_bridge[j][i]);
            if(j!= 9)
            {
                printf(",");
            }
        }
        printf("\n");
    }
}

void save()
{
    FILE *pfile = fopen(chess,"w");
    int j,k;
    for(j = 0; j < 10; j++)
    {
        for(k = 0; k < 10; k++)
        {
            fprintf(pfile,"%d",chess_board[k][j]);
            if(k != 9)
            {
                fprintf(pfile,",");
            }
        }
        if(j < 9)
        {
            fprintf(pfile,"\n");
        }
    }
    fclose(pfile);
}

void getteam(char team)
{
    if(team == 'W')
    {
        team = 1;
        enemy = 2;
    }
    else if(team == 'B')
    {
        team = 2;
        enemy = 1;
    }
}

void readfile_bridge()
{
    int i = 0;
    int j = 0;
    char word;
    FILE *pfile = fopen(bridge,"r");
    if (pfile == NULL)
    {
        printf("file not found!");
    }
    else
    {
        while(!feof(pfile))
        {
            word = (size_t)pfile;
            if(word != '\n')
            {
                fscanf(pfile,"%d,%d,%d,%d,%d,%d,%d,%d,%d,%d",&bridge_board[j][i],&bridge_board[j+1][i],&bridge_board[j+2][i],&bridge_board[j+3][i],&bridge_board[j+4][i],&bridge_board[j+5][i],&bridge_board[j+6][i],&bridge_board[j+7][i],&bridge_board[j+8][i],&bridge_board[j+9][i]);
                i++;
            }
        }
    }
    show_bridge();
    fclose(pfile);
}

void show_bridge()
{
    int i,j;
    printf("bridge:\n");
    for(i = 0;i < 10;i++)
    {
        for(j = 0;j < 10;j++)
        {
            printf("%d",bridge_board[j][i]);
            if(j!= 9)
            {
                printf(",");
            }
        }
        printf("\n");
    }
}

void save_bridge()
{
    FILE *pfile = fopen(bridge,"w");
    int j,k;
    for(j = 0; j < 10; j++)
    {
        for(k = 0; k < 10; k++)
        {
            fprintf(pfile,"%d",bridge_board[k][j]);
            if(k != 9)
            {
                fprintf(pfile,",");
            }
        }
        if(j < 9)
        {
            fprintf(pfile,"\n");
        }
    }
    fclose(pfile);
}

void write_bridge(int i,int j)
{
    int a,b;
    int max = 0;
    int count = 0;
    for(a = 0; a < 10; a++)
    {
        for(b = 0; b < 10; b++)
        {
            if(bridge_board[a][b] >= max)
            {
                max = bridge_board[a][b];
            }
        }
    }
    if(chess_and_bridge[i][j] == 'B')
    {
        bridge_board[i][j] = 1;
    }
    else if(chess_and_bridge[i][j] == '0')
    {
        bridge_board[i][j] = 0;
    }
    else if(chess_and_bridge[i][j] == '1')
    {
        bridge_board[i][j] = 1;
    }
    else if(chess_and_bridge[i][j] == '2')
    {
        bridge_board[i][j] = 2;
    }
    else if(chess_and_bridge[i][j] == 'L')
    {
        for(a = 0; a < 10; a++)
        {
            for(b = 0; b < 10; b++)
            {
                if(bridge_board[a][b] == max)
                {
                    count++;
                }
            }
        }
        if(count == 1)
        {
            bridge_board[i][j] = max;
        }
        else
        {
            bridge_board[i][j] = max + 1;
        }
    }
}

void read_step()
{
    char buff[5][20] = {};
    char temp[20];
    int i = 0;
    char word;
    char *substr = NULL;
    char ch;
    int max;
    int a,b;
    FILE *pfile = fopen(step,"r");
    if(pfile == NULL)
    {
        printf("file not found!");
    }
    else
    {
        while((ch = fgetc(pfile)) != EOF)
        {
            word = (size_t)pfile;
            if(word != '\n')
            {
                fgets(temp,20,pfile);
                substr = strtok(temp, "_");
                do
                {
                    strcpy(buff[i],substr);
                    printf("#%d--%s\n",i,buff[i]);
                    i++;
                    if(i > 3)
                    {
                        i = 0;
                    }
                    substr = strtok(NULL, "_");
                } while (substr);
            }
        }
        printf("#%d--%s\n",i,buff[0]);
        printf("#%d--%s\n",i,buff[1]);
        printf("#%d--%s\n",i,buff[2]);
        printf("#%d--%s\n",i,buff[3]);
        if(team == 1 && (buff[0][0] - '0')%2 == 0)
        {
            if(0 == strcmp(buff[1],"Chess"))
            {
               chess_board[buff[2][0] - '0'][buff[2][2] - '0'] = 2;
               chess_board[buff[3][0] - '0'][buff[3][2] - '0'] = 2;
               show_chess();
            }
            else if(0 == strcmp(buff[1],"Change"))
            {
               chess_board[buff[2][0] - '0'][buff[2][2] - '0'] = 2;
               chess_board[buff[3][0] - '0'][buff[3][2] - '0'] = 2;
               show_chess();
            }
            else if(0 == strcmp(buff[1],"Bridge"))
            {
                max = 0;
                for(a = 0; a < 10; a++)
                {
                    for(b = 0; b < 10; b++)
                    {
                        if(bridge_board[a][b] >= max)
                        {
                            max++;
                        }
                    }
                }
               bridge_board[buff[2][0] - '0'][buff[2][2] - '0'] = max;
               bridge_board[buff[3][0] - '0'][buff[3][2] - '0'] = max;
               show_bridge();
            }
        }
        else if(team == 2 && (buff[0][0] - '0')%2 == 1)
        {
            if(0 == strcmp(buff[1],"Chess"))
            {
               chess_board[buff[2][0] - '0'][buff[2][2] - '0'] = 1;
               chess_board[buff[3][0] - '0'][buff[3][2] - '0'] = 1;
               show_chess();
            }
            else if(0 == strcmp(buff[1],"Change"))
            {
               chess_board[buff[2][0] - '0'][buff[2][2] - '0'] = 1;
               chess_board[buff[3][0] - '0'][buff[3][2] - '0'] = 1;
               show_chess();
            }
            else if(0 == strcmp(buff[1],"Bridge"))
            {
                max = 0;
                for(a = 0; a < 10; a++)
                {
                    for(b = 0; b < 10; b++)
                    {
                        if(bridge_board[a][b] >= max)
                        {
                            max++;
                        }
                    }
                }
               bridge_board[buff[2][0] - '0'][buff[2][2] - '0'] = max;
               bridge_board[buff[3][0] - '0'][buff[3][2] - '0'] = max;
               show_bridge();
            }
        }
        else
        {
            printf("");
        }
    }
}

int chess_strategy()
{
    printf("CHESS@@@@@@\n");
    int i,j;
    int count = 0;
    int temp = 0;
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            if(chess_board[i][j] == team)
            {
                count++;
            }
        }
    }
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            /**第一步*/
            if(count == 0)
            {
                if (chess_board[i][j] == 0 &&
                chess_board[i][j + 1] == 0 &&
                chess_board[i][j] >= 0 &&
                chess_board[i][j + 1] >= 0 &&
                j + 1 < 10)
                {
                    chess_board[i][j] = team;
                    chess_board[i][j + 1] = team;
                    return 1;
                }
                else if (chess_board[i][j] == 0 &&
                chess_board[i + 1][j] == 0 &&
                chess_board[i][j] >= 0 &&
                chess_board[i + 1][j] >= 0 &&
                i + 1 < 10)
                {
                    chess_board[i][j] = team;
                    chess_board[i + 1][j] = team;
                    return 1;
                }
                else
                {
                    printf("error!");
                }
            }
            /**後來*/
            else if(count != 0)
            {
                if(chess_board[i][j] == team &&
                   chess_board[i][j + 1] == team &&
                   0 == type(i,j) &&
                   j + 1 < 10)/**找到自己人and非已填滿的情況(2橫)*/
                {
                    if(i + 1 < 10 &&
                       j + 1 < 10 &&
                       chess_board[i + 1][j] == 0 &&
                       chess_board[i + 1][j + 1] == 0)/**下下面*//**橫*/
                    {
                        chess_board[i + 1][j] = team;
                        chess_board[i + 1][j + 1] = team;
                        return 1;
                    }
                    else if (i - 1 >= 0 &&
                             j + 1 < 10 &&
                             chess_board[i - 1][j] == 0 &&
                             chess_board[i - 1][j + 1] == 0)/**下上面*/
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 1][j + 1] = team;
                        return 1;
                    }
                    else if(i + 1 < 10 &&
                            j + 2 < 10 &&
                            chess_board[i + 1][j + 1] == 0 &&
                            chess_board[i + 1][j + 2] == 0)/**斜角*/
                    {
                        chess_board[i + 1][j + 1] = team;
                        chess_board[i + 1][j + 2] = team;
                        return 1;
                    }
                    else if(i - 1 >= 0 &&
                            j + 2 < 10 &&
                            chess_board[i - 1][j + 1] == 0 &&
                            chess_board[i - 1][j + 2] == 0)
                    {
                        chess_board[i - 1][j + 1] = team;
                        chess_board[i - 1][j + 2] = team;
                        return 1;
                    }
                    else if(i - 1 >= 0 &&
                            j - 1  >= 0 &&
                            chess_board[i - 1][j] == 0 &&
                            chess_board[i - 1][j - 1] == 0)
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 1][j - 1] = team;
                        return 1;
                    }
                    else if(i + 1 < 10 &&
                            j - 1  >= 0 &&
                            chess_board[i + 1][j] == 0 &&
                            chess_board[i + 1][j - 1] == 0)
                    {
                        chess_board[i + 1][j] = team;
                        chess_board[i + 1][j - 1] = team;
                        return 1;
                    }
                    else if(j + 2 < 10 &&
                            chess_board[i][j + 1] == 0 &&
                            chess_board[i][j + 2] == 0)/**左右*/
                    {
                        chess_board[i][j + 1] = team;
                        chess_board[i][j + 2] = team;
                        return 1;
                    }
                    else if(j - 2 >= 0 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i][j - 2] == 0)
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i][j - 2] = team;
                        return 1;
                    }
                    else if(j + 2 < 10 &&
                            i - 1 >= 0 &&
                            chess_board[i][j + 2] == 0 &&
                            chess_board[i - 1][j + 2] == 0)/***//**直*/
                    {
                        chess_board[i][j + 2] = team;
                        chess_board[i - 1][j + 2] = team;
                        return 1;
                    }
                    else if(j + 2 < 10 &&
                            i + 1 < 10 &&
                            chess_board[i][j + 2] == 0 &&
                            chess_board[i + 1][j + 2] == 0)/***//**直*/
                    {
                        chess_board[i][j + 2] = team;
                        chess_board[i + 1][j + 2] = team;
                        return 1;
                    }
                    else if(j + 1 < 10 &&
                            i - 2 >= 0 &&
                            chess_board[i - 1][j + 1] == 0 &&
                            chess_board[i - 2][j + 1] == 0)/***//**直*/
                    {
                        chess_board[i - 1][j + 1] = team;
                        chess_board[i - 2][j + 1] = team;
                        return 1;
                    }
                    else if(i - 2 >= 0 &&
                            chess_board[i - 1][j] == 0 &&
                            chess_board[i - 2][j] == 0)/***//**直*/
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 2][j] = team;
                        return 1;
                    }
                    else if(j - 1 >= 0 &&
                            i - 1 >= 0 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i - 1][j - 1] == 0)/***//**直*/
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i - 1][j - 1] = team;
                        return 1;
                    }
                    else if(j - 1 >= 0 &&
                            i + 1 < 10 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i + 1][j - 1] == 0)/***//**直*/
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i + 1][j - 1] = team;
                        return 1;
                    }
                    else if(i + 2 < 10 &&
                            chess_board[i + 1][j] == 0 &&
                            chess_board[i + 2][j] == 0)/***//**直*/
                    {
                        chess_board[i + 1][j] = team;
                        chess_board[i + 2][j] = team;
                        return 1;
                    }
                    else if(i + 2 < 10 &&
                            j + 1 < 10 &&
                            chess_board[i + 1][j + 1] == 0 &&
                            chess_board[i + 2][j + 1] == 0)/***//**直*/
                    {
                        chess_board[i + 1][j + 1] = team;
                        chess_board[i + 2][j + 1] = team;
                        return 1;
                    }
                    else
                    {
                        continue;
                    }
                }
                else if(chess_board[i][j] == team &&
                        chess_board[i + 1][j] == team &&
                        0 == type(i,j) &&
                        i + 1 < 10)/**找到自己人and非已填滿的情況(2直)*/
                {
                    if(j + 1 < 10 &&
                       i + 1 < 10 &&
                       chess_board[i][j + 1] == 0 &&
                       chess_board[i + 1][j + 1] == 0)/***//**直*/
                    {
                        chess_board[i][j + 1] = team;
                        chess_board[i + 1][j + 1] = team;
                        return 1;
                    }
                    else if(j + 1 < 10 &&
                            i - 1 >= 0 &&
                            chess_board[i][j + 1] == 0 &&
                            chess_board[i - 1][j + 1] == 0)/***//**直*/
                    {
                        chess_board[i][j + 1] = team;
                        chess_board[i - 1][j + 1] = team;
                        return 1;
                    }
                    else if(i - 2 >= 0 &&
                            chess_board[i - 1][j] == 0 &&
                            chess_board[i - 2][j] == 0)/***//**直*/
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 2][j] = team;
                        return 1;
                    }
                    else if(j - 1 >= 0 &&
                            i - 1 >= 0 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i - 1][j - 1] == 0)/***//**直*/
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i - 1][j - 1] = team;
                        return 1;
                    }
                    else if(j - 1 >= 0 &&
                            i + 1 < 10 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i + 1][j - 1] == 0)/***//**直*/
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i + 1][j - 1] = team;
                        return 1;
                    }
                    else if(j - 1 >= 0 &&
                            i + 2 < 10 &&
                            chess_board[i + 1][j - 1] == 0 &&
                            chess_board[i + 2][j - 1] == 0)/***//**直*/
                    {
                        chess_board[i + 1][j - 1] = team;
                        chess_board[i + 2][j - 1] = team;
                        return 1;
                    }
                    else if(i + 3 < 10 &&
                            chess_board[i + 2][j] == 0 &&
                            chess_board[i + 3][j] == 0)/***//**直*/
                    {
                        chess_board[i + 2][j] = team;
                        chess_board[i + 3][j] = team;
                        return 1;
                    }
                    else if(i + 2 < 10 &&
                            j + 1 < 10 &&
                            chess_board[i + 1][j + 1] == 0 &&
                            chess_board[i + 2][j + 1] == 0)/***//**直*/
                    {
                        chess_board[i + 1][j + 1] = team;
                        chess_board[i + 2][j + 1] = team;
                        return 1;
                    }
                    else if(j + 2 < 10 &&
                            chess_board[i][j + 1] == 0 &&
                            chess_board[i][j + 2] == 0)/**下下面*//**橫*/
                    {
                        chess_board[i][j + 1] = team;
                        chess_board[i][j + 2] = team;
                        return 1;
                    }
                    else if(i + 1 < 10 &&
                            j + 2 < 10 &&
                            chess_board[i + 1][j + 1] == 0 &&
                            chess_board[i + 1][j + 2] == 0)/**下下面*//**橫*/
                    {
                        chess_board[i + 1][j + 1] = team;
                        chess_board[i + 1][j + 2] = team;
                        return 1;
                    }
                    else if (i - 1 >= 0 &&
                             j  + 1 < 10 &&
                             chess_board[i - 1][j] == 0 &&
                             chess_board[i - 1][j + 1] == 0)/**下上面*/
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 1][j + 1] = team;
                        return 1;
                    }
                    else if(i - 1 >= 0 &&
                            j - 1 >= 0 &&
                            chess_board[i - 1][j] == 0 &&
                            chess_board[i - 1][j - 1] == 0)/**斜角*/
                    {
                        chess_board[i - 1][j] = team;
                        chess_board[i - 1][j - 1] = team;
                        return 1;
                    }
                    else if(j - 2 >= 0 &&
                            chess_board[i][j - 1] == 0 &&
                            chess_board[i][j - 2] == 0)
                    {
                        chess_board[i][j - 1] = team;
                        chess_board[i][j - 2] = team;
                        return 1;
                    }
                    else if(i + 1 < 10 &&
                            j - 2  >= 0 &&
                            chess_board[i + 1][j - 1] == 0 &&
                            chess_board[i + 1][j - 2] == 0)
                    {
                        chess_board[i + 1][j - 1] = team;
                        chess_board[i + 1][j - 2] = team;
                        return 1;
                    }
                    else if(i + 2 < 10 &&
                            j + 1 < 10 &&
                            chess_board[i + 2][j] == 0 &&
                            chess_board[i + 2][j + 1] == 0)/**左右*/
                    {
                        chess_board[i + 2][j] = team;
                        chess_board[i + 2][j + 1] = team;
                        return 1;
                    }
                    else if(i + 2 < 10 &&
                            j - 1 >= 0 &&
                            chess_board[i + 2][j] == 0 &&
                            chess_board[i + 2][j - 1] == 0)/**左右*/
                    {
                        chess_board[i + 2][j] = team;
                        chess_board[i + 2][j - 1] = team;
                        return 1;
                    }
                    else
                    {
                        continue;
                    }
                }
                else
                {
                    continue;
                }
            }
        }
    }
    for(i = 0; i < 10; i ++)
    {
        for(j = 0;j < 10; j++)
        {
            if (chess_board[i][j] == 0 &&
                chess_board[i][j + 1] == 0 &&
                chess_board[i][j] >= 0 &&
                chess_board[i][j + 1] >= 0 &&
                j + 1 < 10)
            {
                chess_board[i][j] = team;
                chess_board[i][j + 1] = team;
                return 1;
            }
            else if (chess_board[i][j] == 0 &&
            chess_board[i + 1][j] == 0 &&
            chess_board[i][j] >= 0 &&
            chess_board[i + 1][j] >= 0 &&
            i + 1 < 10)
            {
                chess_board[i][j] = team;
                chess_board[i + 1][j] = team;
                return 1;
            }
            else
            {
                continue;
            }
        }
    }
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            if(chess_board[i][j] == 0 && temp < 2)
            {
                chess_board[i][j] = team;
                temp++;
            }
            else if(temp == 2)
            {
                printf("-------------------------%d\n",temp);
                return 1;
            }
        }
    }
}

int bridge_strategy()
{
    printf("BRIDGE@@@@@@\n");
    int i,j;
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            if(chess_board[i][j] < 0)
            {
                chess_and_bridge[i][j] = '0';
            }
            else if(chess_board[i][j]  == 0)
            {
                chess_and_bridge[i][j] = '0';
            }
            else if(chess_board[i][j] == team)
            {
                chess_and_bridge[i][j] = team + '0';
            }
            else if(chess_board[i][j] == enemy)
            {
                chess_and_bridge[i][j] = enemy + '0';
            }
            else
            {
                chess_and_bridge[i][j] = '0';
            }
            if(bridge_board[i][j] != 0)
            {
                chess_and_bridge[i][j] = 'L';
            }
        }
    }
    bridge_island();
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            if(chess_and_bridge[i][j] == team + '0')/**找島*/
            {
                if (chess_and_bridge[i][j + 1] == '0' &&/**type1**/
                   (chess_and_bridge[i][j + 2] == team + '0' ||
                    chess_and_bridge[i][j + 2] == 'B' ) &&
                   j + 2 < 10)
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i][j + 2] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i,j + 2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(chess_and_bridge[i + 1][j] == '0' &&
                        (chess_and_bridge[i + 2][j] == team + '0' ||
                        chess_and_bridge[i + 2][j] == 'B' ) &&
                        i + 2 < 10)
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i + 2][j] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+2,j);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(chess_and_bridge[i - 1][j] == '0' &&
                        (chess_and_bridge[i - 2][j] == team + '0' ||
                        chess_and_bridge[i - 2][j] == 'B' ) &&
                        i - 2 >= 0)
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i - 2][j] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i-2,j);
                    show_chess_and_bridge();
                    return 1;
                }
                else if (chess_and_bridge[i][j - 1] == '0' &&
                        (chess_and_bridge[i][j - 2] == team + '0' ||
                        chess_and_bridge[i][j - 2] == 'B' ) &&
                        j - 2 < 10)
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i][j - 2] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i,j-2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 2 >= 0 &&
                        j + 1 < 10 &&
                        chess_and_bridge[i - 1][j] == '0' &&
                        chess_and_bridge[i - 1][j + 1] == '0' &&
                        (chess_and_bridge[i - 2][j + 1] == team + '0' ||
                        chess_and_bridge[i - 2][j + 1] == 'B' ))/**type2**/
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i - 2][j + 1] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i-2,j+1);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 2 < 10 &&
                        j + 1 < 10 &&
                        chess_and_bridge[i + 1][j] == '0' &&
                        chess_and_bridge[i + 1][j + 1] == '0' &&
                        (chess_and_bridge[i + 2][j + 1] == team + '0' ||
                        chess_and_bridge[i + 2][j + 1] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i + 2][j + 1] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+2,j+1);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 2 >= 0 &&
                        j - 1 >= 0 &&
                        chess_and_bridge[i - 1][j] == '0' &&
                        chess_and_bridge[i - 1][j - 1] == '0' &&
                        (chess_and_bridge[i - 2][j - 1] == team + '0' ||
                        chess_and_bridge[i - 2][j - 1] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i - 2][j - 1] = 'L';
                    bridge_island();
                    write_bridge(i-2,j-1);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 2 < 10 &&
                        j - 1 >= 0 &&
                        chess_and_bridge[i + 1][j] == '0' &&
                        chess_and_bridge[i + 1][j - 1] == '0' &&
                        (chess_and_bridge[i + 2][j - 1] == team + '0' ||
                        chess_and_bridge[i + 2][j - 1] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i + 2][j - 1] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+2,j-1);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 1 >= 0 &&
                        j + 2 < 10 &&
                        chess_and_bridge[i][j + 1] == '0' &&
                        chess_and_bridge[i - 1][j + 1] == '0' &&
                        (chess_and_bridge[i - 1][j + 2] == team + '0' ||
                        chess_and_bridge[i - 1][j + 2] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i - 1][j + 2] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i-1,j+2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 1 < 10 &&
                        j + 2 < 10 &&
                        chess_and_bridge[i][j + 1] == '0' &&
                        chess_and_bridge[i + 1][j + 1] == '0' &&
                        (chess_and_bridge[i + 1][j + 2] == team + '0' ||
                        chess_and_bridge[i + 1][j + 2] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i + 1][j + 2] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+1,j+2);
                    show_bridge();
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 1 < 10 &&
                        j - 2 >= 0 &&
                        chess_and_bridge[i][j - 1] == '0' &&
                        chess_and_bridge[i + 1][j - 1] == '0' &&
                        (chess_and_bridge[i + 1][j - 2] == team + '0' ||
                        chess_and_bridge[i + 1][j - 2] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i + 1][j - 2] = 'L';
                    bridge_island();
                    write_bridge(i+1,j-2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 1 >= 0 &&
                        j - 2 >= 0 &&
                        chess_and_bridge[i][j - 1] == '0' &&
                        chess_and_bridge[i - 1][j - 1] == '0' &&
                        (chess_and_bridge[i - 1][j - 2] == team + '0' ||
                        chess_and_bridge[i - 1][j - 2] == 'B' ))
                {
                    chess_and_bridge[i][j] = 'L';
                    chess_and_bridge[i - 1][j - 2] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i-1,j-2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 2 < 10 &&
                        j + 2 < 10 &&
                        chess_and_bridge[i + 1][j + 1] == '0' &&
                        (chess_and_bridge[i + 2][j + 2] == team + '0' ||
                        chess_and_bridge[i + 2][j + 2] == 'B' ))/**type3*/
                {
                    chess_and_bridge[i + 2][j + 2] = 'L';
                    chess_and_bridge[i][j] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+2,j+2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i + 2 < 10 &&
                        j - 2 >= 0 &&
                        chess_and_bridge[i + 1][j - 1] == '0' &&
                        (chess_and_bridge[i + 2][j - 2] == team + '0' ||
                        chess_and_bridge[i + 2][j - 2] == 'B' ))/**type3*/
                {
                    chess_and_bridge[i + 2][j - 2] = 'L';
                    chess_and_bridge[i][j] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i+2,j-2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 2  >= 0 &&
                        j - 2 >= 0 &&
                        chess_and_bridge[i - 1][j - 1] == '0' &&
                        (chess_and_bridge[i - 2][j - 2] == team + '0' ||
                        chess_and_bridge[i - 2][j - 2] == 'B' ))/**type3*/
                {
                    chess_and_bridge[i - 2][j - 2] = 'L';
                    chess_and_bridge[i][j] = 'L';
                    bridge_island();
                    write_bridge(i,j);
                    write_bridge(i-2,j-2);
                    show_chess_and_bridge();
                    return 1;
                }
                else if(i - 2  >= 0 &&
                        j + 2 < 10 &&
                        chess_and_bridge[i - 1][j + 1] == '0' &&
                        (chess_and_bridge[i - 2][j + 2] == team + '0' ||
                        chess_and_bridge[i - 2][j + 2] == 'B' ))/**type3*/
                {
                    chess_and_bridge[i - 2][j + 2] = 'L';
                    chess_and_bridge[i][j] = 'L';
                    bridge_island();
                    write_bridge(i-2,j+2);
                    show_chess_and_bridge();
                    return 1;
                }
                else
                {
                    continue;
                }
            }
            else
            {
                continue;
            }
        }
    }
    bridge_island();
    show_chess_and_bridge();
    return 0;
}

int type(int i,int j)/**找出島嶼並列出不能擺的位置*/
{
    int a,b;
    if(chess_board[i][j] == team &&
       chess_board[i][j + 1] == team &&
       chess_board[i][j + 2] == team &&
       chess_board[i][j + 3] == team &&
       (j + 3) < 10)/**一橫*/
    {
        for(a = -1; a < 2; a++)
        {
            for(b = -1; b < 5; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 2][j] == team &&
            chess_board[i + 3][j] == team &&
            (i + 3) < 10)/**一直**/
    {
        for(a = -1; a < 5; a++)
        {
            for(b = -1; b < 2; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j + 1] == team &&
            (i + 1) < 10 &&
            (j + 1) < 10)/**田*/
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i][j + 2] == team &&
            chess_board[i + 1][j + 2] == team)/**111*/
                                              /**001*/
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 4; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i + 2 < 10 && chess_board[i + 2][j] < 0)
        {
            chess_board[i + 2][j] += 1;
        }
        if(i + 2 < 10 && j - 1 >= 0 && chess_board[i + 2][j-1] < 0)
        {
            chess_board[i + 2][j - 1] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i][j + 2] == team &&
            chess_board[i + 1][j + 1] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 4; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i + 2 < 10 && j - 1 >= 0 && chess_board[i + 2][j-1] < 0)
        {
            chess_board[i + 2][j - 1] += 1;
        }
        if(i + 2 < 10 && j + 3 < 10 && chess_board[i + 2][j + 3] < 0)
        {
            chess_board[i + 2][j + 3] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i][j + 2] == team &&
            chess_board[i + 1][j] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 4; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i + 2 < 10 && j + 2 < 10 && chess_board[i + 2][j + 2] < 0)
        {
            chess_board[i + 2][j + 2] += 1;
        }
        if(i + 2 < 10 && j + 3 < 10 && chess_board[i + 2][j + 3] < 0)
        {
            chess_board[i + 2][j + 3] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j - 1] == team &&
            chess_board[i + 1][j - 2] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -3; b < 2; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1 >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j - 2] += 1;
        }
        if(i - 1 >= 0 && j - 3 >= 0 && chess_board[i-1][j-3] < 0)
        {
            chess_board[i - 1][j - 3] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j + 1] == team &&
            chess_board[i + 1][j - 1] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -2; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1 >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j - 2] += 1;
        }
        if(i - 1 >= 0 && j + 2 < 10 && chess_board[i-1][j + 2] < 0)
        {
            chess_board[i - 1][j + 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j + 1] == team &&
            chess_board[i + 1][j + 2] == team &&
            chess_board[i + 1][j] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 4; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1 >= 0 && j + 2 < 10 && chess_board[i-1][j + 2] < 0)
        {
            chess_board[i - 1][j + 2] += 1;
        }
        if(i - 1 >= 0 && j + 3 < 10 && chess_board[i-1][j + 3] < 0)
        {
            chess_board[i - 1][j + 3] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&/**11*/
            chess_board[i + 2][j] == team &&/**10*/
            chess_board[i][j + 1] == team)  /**10*/
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(j + 2 < 10 && i + 2 < 10 && chess_board[i + 2][j + 2] < 0)
        {
            chess_board[i + 2][j + 2] += 1;
        }
        if(j + 2 < 10 && i + 3 < 10 && chess_board[i + 3][j + 2] < 0)
        {
             chess_board[i + 3][j + 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 2][j] == team &&
            chess_board[i + 1][j + 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i + 3 < 10 && j + 2 < 10 && chess_board[i + 3][j + 2] < 0)
        {
            chess_board[i + 3][j + 2] += 1;
        }
        if(i - 1 >= 0 && j + 2 < 10 && chess_board[i-1][j + 2] <= 0)
        {
            chess_board[i - 1][j + 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 2][j] == team &&
            chess_board[i + 2][j + 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(j + 2 < 10 && chess_board[i][j + 2] < 0)
        {
            chess_board[i][j + 2] += 1;
        }
        if(i - 1 >= 0 && j + 2 < 10 && chess_board[i-1][j + 2] < 0)
        {
            chess_board[i - 1][j + 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j + 1] == team &&
            chess_board[i + 2][j + 1] == team &&
            chess_board[i][j + 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i + 2  < 10 && j - 1 >= 0 && chess_board[i + 2][j-1] < 0)
        {
            chess_board[i + 2][j - 1] += 1;
        }
        if(i + 3  < 10 && j - 1 >= 0 && chess_board[i + 3][j-1] < 0)
        {
            chess_board[i + 3][j - 1] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 2][j] == team &&
            chess_board[i + 1][j - 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -2; b < 2; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j - 2] += 1;
        }
        if(i + 3  < 10 && j - 2 >= 0 && chess_board[i + 3][j-2] < 0)
        {
            chess_board[i + 3][j - 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 2][j] == team &&
            chess_board[i + 2][j - 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -2; b < 2; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j - 2] += 1;
        }
        if(j - 2 >= 0 && chess_board[i][j-2] < 0)
        {
            chess_board[i][j - 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i + 1][j + 1] == team &&
            chess_board[i + 1][j + 2] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -1; b < 4; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j + 3 < 10 && chess_board[i-1][j + 3] < 0)
        {
            chess_board[i - 1][j + 3] += 1;
        }
        if(i + 2  < 10 && j - 1 >= 0 && chess_board[i + 2][j-1] < 0)
        {
            chess_board[i + 2][j - 1] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i][j + 1] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j - 1] == team)
    {
        for(a = -1; a < 3; a++)
        {
            for(b = -2; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j- 2] += 1;
        }
        if(i + 2  < 10 && j + 2 < 10 && chess_board[i + 2][j + 2] < 0)
        {
            chess_board[i + 2][j + 2] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j + 1] == team &&
            chess_board[i + 2][j + 1] == team)
    {
        for(a = -1; a < 4; a++)
        {
            for(b = -1; b < 3; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j + 2 < 10 && chess_board[i-1][j + 2] < 0)
        {
            chess_board[i - 1][j + 2] += 1;
        }
        if(i + 3  < 10 && j - 1 >= 0 && chess_board[i + 3][j-1] < 0)
        {
            chess_board[i + 3][j - 1] += 1;
        }
        return 1;
    }
    else if(chess_board[i][j] == team &&
            chess_board[i + 1][j] == team &&
            chess_board[i + 1][j - 1] == team &&
            chess_board[i + 2][j - 1] == team)
    {

        for(a = -1; a < 4; a++)
        {
            for(b = -2; b < 2; b++)
            {
                if(chess_board[i + a][j + b] <= 0 &&
                   (i + a) >=0 &&
                   (i + a) < 10 &&
                   (j + b) >= 0 &&
                   (j + b) < 10)
                {
                    chess_board[i + a][j + b] -= 1;
                }
            }
        }
        if(i - 1  >= 0 && j - 2 >= 0 && chess_board[i-1][j-2] < 0)
        {
            chess_board[i - 1][j - 2] += 1;
        }
        if(i + 3  < 10 && j + 1  < 10 && chess_board[i + 3][j + 1] < 0)
        {
            chess_board[i + 3][j + 1] += 1;
        }
        return 1;
    }
    else
    {
        return 0;
    }
}

void bridge_block()
{
    int i,j;
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 10; j++)
        {
            if(bridge_board[i][j] != 0)
            {
                if(j + 2 < 10 && bridge_board[i][j] == bridge_board[i][j + 2])
                {
                    chess_board[i][j + 1] -= 1;
                }
                else if(i + 2 < 10 && bridge_board[i + 2][j] == bridge_board[i][j])
                {
                    chess_board[i + 1][j] -= 1;
                }
                else if(j + 2 < 10 && i + 1 < 10 && bridge_board[i][j] == bridge_board[i + 1][j + 2])
                {
                    chess_board[i][j + 1] -= 1;
                    chess_board[i + 1][j + 1] -= 1;
                }
                else if(j - 2 >= 0 && i + 1 < 10 && bridge_board[i][j] == bridge_board[i + 1][j - 2])
                {
                    chess_board[i][j - 1] -= 1;
                    chess_board[i + 1][j - 1] -= 1;
                }
                else if(j - 1 >= 0 && i + 2 < 10 && bridge_board[i][j] == bridge_board[i + 2][j - 1])
                {
                    chess_board[i + 1][j] -= 1;
                    chess_board[i + 1][j - 1] -= 1;
                }
                else if(j + 1 < 10 && i + 2 < 10 && bridge_board[i][j] == bridge_board[i + 2][j + 1])
                {
                    chess_board[i + 1][j] -= 1;
                    chess_board[i + 1][j + 1] -= 1;
                }
                else if(j + 2 < 10 && i + 2 < 10 && bridge_board[i][j] == bridge_board[i + 2][j + 2])
                {
                    chess_board[i + 1][j + 1] -= 1;
                }
                else if(j - 2 >= 0 && i + 2 < 10 && bridge_board[i][j] == bridge_board[i + 2][j - 2])
                {
                    chess_board[i + 1][j - 1] -= 1;
                }
            }
        }
    }
    show_chess();
}

void bridge_island()
{
    int x,i,j;
    for(x = 0; x < 4; x++)
    {
        for(i = 0;i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if(chess_and_bridge[i][j] == 'L' || chess_and_bridge[i][j] == 'B')
                {
                    if(chess_and_bridge[i + 1][j] == team + '0' &&
                       i + 1 < 10)
                    {
                        chess_and_bridge[i + 1][j] =  'B';
                    }
                    if(chess_and_bridge[i][j + 1] == team + '0' &&
                       j + 1 < 10)
                    {
                        chess_and_bridge[i][j + 1] =  'B';
                    }
                    if(chess_and_bridge[i - 1][j] == team + '0' &&
                       i - 1 >= 0)
                    {
                        chess_and_bridge[i - 1][j] =  'B';
                    }
                    if(chess_and_bridge[i][j - 1] == team + '0' &&
                       j - 1 >= 0)
                    {
                        chess_and_bridge[i][j - 1] =  'B';
                    }
                }
            }
        }
    }
}

void clear()
{
    int i,j;
    for(i = 0; i < 10; i++)
    {
        for(j = 0;j < 10; j ++)
        {
            if(chess_board[i][j] < 0)
            {
                chess_board[i][j] = 0;
            }
        }
    }
}
