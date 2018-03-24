#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <windows.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
    int tamy = 25;
    int tamx = 42;
    int x, y, yi;
    char mundo[tamy][tamx];
    char jogador = 'A';
    char jgdLaser = '°';
    char inim = 'W';
    char inimEscudo = 'H';
    char inimLaser = '¡';
    char xablau = 'X';
    int placar = 0;
    int vitoria = 1;
    int laserPrt = 1;
    int inimPronto = 0;


    //Tela de Boas vindas ao jogador, printf's com delay entre eles.
    printf("\n \n     A muito tempo atrás, numa galáxia muito distante \n \n \n \n");
    Sleep(1500);
    printf("  Houve uma invasão no PROMPT DE COMANDO. \n \n \n \n");
    Sleep(2500);
    printf("  E somente você é capaz de derrotar os invasores. \n \n \n \n");
    Sleep(2500);
    printf("  Seus controles são: Teclas A e D para mover e M para atirar.  \n \n \n \n");
    Sleep(2500);
    printf("               Que a força esteja com você!");
    Sleep(1000);
    printf("\n \n \n \n Pressione qualquer tecla pra iniciar essa bagaça!");
    getch();

    //Iniciolização do mundo
    int inimigosT = 0;
    for (x = 0; x < tamx; x ++) {
        for (y = 0; y < tamy; y ++) {
            if ((y+1) % 2 == 0 && y < 7 && x > 4
            && x < tamx - 5 && x % 2 ==0) {
                mundo[y][x] = inim;
                inimigosT ++;
            }
            else if ((y+1) % 2 == 0 && y >= 7 && y < 9 && x > 4
            && x < tamx - 5 && x % 2 ==0){
                mundo[y][x] = inimEscudo;
                inimigosT = inimigosT + 2;
            }
            else {
                mundo[y][x] = ' ';
            }
        }
    }
    mundo[tamy - 1][tamx / 2] = jogador;
    int i = 1;
    char direcao = 'l';
    char movimento;
    int atInimigos = inimigosT;
    while(atInimigos > 0 && vitoria) {
        int drop = 0;
        int inimSpd = 1 + 10 * atInimigos / inimigosT;
        laserPrt ++;

        //Mundo a ser exibido 
        system("cls");
        printf("     Placar:    %d", placar);
        printf("\n");
            for (y = 0; y < tamy; y ++) {
            printf("|");
                for (x = 0; x < tamx; x ++) {
                    printf("%c",mundo[y][x]);
                }
            printf("|");
            printf("\n");
            }

        //Velocidade de movimento do laser
        for (x = 0; x < tamx; x ++) {
            for (y = tamy-1; y >= 0; y --) {
                if (i%2 == 0 && mundo[y][x] == inimLaser
                && (mundo[y+1][x] != inim & mundo[y+1][x] != inimEscudo)){
                mundo[y+1][x] = inimLaser;
                mundo[y][x] = ' ';
                }
                else if (i%2 == 0 && mundo[y][x] == inimLaser
                && (mundo[y+1][x] == inim | mundo[y+1][x] == inimEscudo)){
                    mundo[y][x] = ' ';
                }
            }
        }
        for (x = 0; x < tamx; x ++) {
            for (y = 0; y < tamy; y ++) {
                if ((i % 5) == 0 && (mundo[y][x] == inimEscudo
                | mundo[y][x] == inim) && (rand() % 15) > 13
                && mundo[y+1][x] != jgdLaser) {
                    for (yi = y+1; yi < tamy; yi ++) {
                        if (mundo[yi][x] == inim
                        | mundo[yi][x] == inimEscudo) {
                            inimPronto = 0;
                            break;
                        }
                        inimPronto = 1;
                    }
                    if (inimPronto) {
                        mundo[y+1][x] = inimLaser;
                    }
                }
                if (mundo[y][x] == jgdLaser && mundo[y-1][x] == inim) {
                    mundo[y][x] = ' ';
                    mundo[y-1][x] = xablau;
                    atInimigos --;
                    placar = placar + 50;
                }
                else if (mundo[y][x] == jgdLaser
                && mundo[y-1][x] == inimEscudo) {
                    mundo[y][x] = ' ';
                    mundo[y-1][x] = inim;
                    atInimigos --;
                    placar = placar + 50;
                }
                else if (mundo[y][x] == jgdLaser
                && mundo[y-1][x] == inimLaser) {
                    mundo[y][x] = ' ';
                }
                else if (mundo[y][x] == xablau) {
                    mundo[y][x] = ' ';
                }
                else if ((i+1) % 2 == 0 && mundo[y][x] == inimLaser
                && mundo[y+1][x] == jogador) {
                    mundo[y+1][x] = xablau;
                    mundo[y][x] = ' ';
                    vitoria = 0;
                }
                else if (mundo[y][x] == jgdLaser
                && mundo[y-1][x] != inimLaser) {
                        mundo[y][x] = ' ';
                        mundo[y-1][x] = jgdLaser;
                }
            }
        }

        //Atualização entre posições dos inimigos
        for (y = 0; y < tamy; y ++) {
            if (mundo[y][0] == inim) {
                direcao = 'r';
                drop = 1;
                break;
            }
            if (mundo[y][tamx-1] == inim){
                direcao = 'l';
                drop = 1;
                break;
            }
        }

        //Atualização do mundo
        if (i % inimSpd == 0) {
            if (direcao == 'l') {
                for (x = 0; x < tamx - 1; x ++) {
                    for (y = 0; y < tamy; y ++) {
                        if (drop && (mundo[y-1][x+1] == inim
                            || mundo[y-1][x+1] == inimEscudo)){
                            mundo[y][x] = mundo[y-1][x+1];
                            mundo[y-1][x+1] = ' ';
                        }
                        else if (!drop && (mundo[y][x+1] == inim
                            || mundo[y][x+1] == inimEscudo)) {
                            mundo[y][x] = mundo[y][x+1];
                            mundo[y][x+1] = ' ';
                        }
                    }
                }
            }
            else {
                for (x = tamx; x > 0; x --) {
                    for (y = 0; y < tamy; y ++) {
                        if (drop && (mundo[y-1][x-1] == inim
                            || mundo[y-1][x-1] == inimEscudo)) {
                            mundo[y][x] = mundo[y-1][x-1];
                            mundo[y-1][x-1] = ' ';
                        }
                        else if (!drop && (mundo[y][x-1] == inim
                            || mundo[y][x-1] == inimEscudo)) {
                            mundo[y][x] = mundo[y][x-1];
                            mundo[y][x-1] = ' ';
                        }
                    }
                }
            }
            for (x = 0; x < tamx; x ++) {
                if (mundo[tamy - 1][x] == inim) {
                    vitoria = 0;
                }
            }
        }

        //Movimento da nave
        if(kbhit()){
            movimento = getch();
        }
        else {
           movimento = ' ';
        }
        if (movimento == 'a') {
            for (x = 0; x < tamx; x = x+1) {
                if ( mundo[tamy-1][x+1] == jogador) {
                    mundo[tamy-1][x] = jogador;
                    mundo[tamy-1][x+1] = ' ';
                }
            }
        }

        if (movimento == 'd') {
            for (x = tamx - 1; x > 0; x = x-1) {
                if ( mundo[tamy-1][x-1] == jogador) {
                    mundo[tamy-1][x] = jogador;
                    mundo[tamy-1][x-1] = ' ';
                }
            }
        }
        if (movimento == 'm' && laserPrt > 2) {
            for (x = 0; x < tamx; x = x+1) {
                if ( mundo[tamy-1][x] == jogador) {
                    mundo[tamy - 2][x] = jgdLaser;
                    laserPrt = 0;
                }
            }
        }
        i ++;
        //Sleep(10);
    }
    system("cls");
        printf("     Placar:    %d", placar);
        printf("\n");
            for (y = 0; y < tamy; y ++) {
            printf("|");
                for (x = 0; x < tamx; x ++) {
                    printf("%c",mundo[y][x]);
                }
            printf("|");
            printf("\n");
            }
    Sleep(1000);
    system("cls");
    if (vitoria != 0) {
        printf("\n \n \n \n \n \n               PARABÉNS, VOCÊ IMPEDIU A INVASÃO \n \n \n \n \n");
        Sleep(1000);
        printf("\n \n               Placar: %d", placar);
        Sleep(1000);
        int bonus = inimigosT*20 - i;
        printf("\n \n               Bonus: %d", bonus);
        Sleep(1000);
        printf("\n \n               Placar Final: %d", placar + bonus);
        printf("\n \n \n \n               Boa Monstro! Cê é o Bixão mermo!");
        Sleep(1000);
        printf(", Hero.");
        Sleep(1000);
        getch();
    }
    else {
        printf("\n \n \n \n \n \n               Ih, não deu cara.");
        Sleep(1000);
        printf("\n \n \n \n \n \n               O seu PROMPT já era!!!");
        Sleep(1000);
        printf("\n \n               Placar final: %d", placar);
        getch();
    }
}
