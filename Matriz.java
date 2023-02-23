/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades;

/**
 *
 * @author Leona
 */
public class Matriz {
    public static void main(String[] args) {
 
    int m1[][]={{3,1,3},{6,5,5}};
    int m2[][]={{100,50,50},{50,100,50}};
    int m[][]=new int[2][2]; 

    for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
        m[i][j]=0;
    for(int k=0;k<2;k++)
    {
        m[i][j]+=m1[i][k]*m2[k][j];
    }

        System.out.print(m[i][j]+" "); 
    }

        System.out.println();
    }
 }
}
    
    
    

