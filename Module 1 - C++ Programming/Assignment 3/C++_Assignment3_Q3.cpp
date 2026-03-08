//============================================================================
// Name        : C++_Assignment3_Q3.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Matrix {
private:
    int rows, cols;
    int **mat;

public:
    Matrix(int r=0, int c=0) {
        rows = r;
        cols = c;

        if(rows>0 && cols>0) {
            mat = new int*[rows];
            for(int i=0;i<rows;i++)
                mat[i] = new int[cols];
        }
        else
            mat = NULL;
    }
    friend istream& operator>>(istream &in, Matrix &m) {

        cout<<"Enter rows and columns: ";
        in>>m.rows>>m.cols;

        m.mat = new int*[m.rows];

        for(int i=0;i<m.rows;i++)
            m.mat[i] = new int[m.cols];

        cout<<"Enter matrix elements:\n";

        for(int i=0;i<m.rows;i++)
            for(int j=0;j<m.cols;j++)
                in>>m.mat[i][j];

        return in;
    }
    friend ostream& operator<<(ostream &out, Matrix &m) {

        for(int i=0;i<m.rows;i++) {
            for(int j=0;j<m.cols;j++) {
                out<<m.mat[i][j]<<" ";
            }
            out<<endl;
        }
        return out;
    }
    Matrix operator+(Matrix &m) {

        Matrix temp(rows, cols);

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                temp.mat[i][j] = mat[i][j] + m.mat[i][j];

        return temp;
    }
    bool operator==(Matrix &m) {

        if(rows!=m.rows || cols!=m.cols)
            return false;

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                if(mat[i][j] != m.mat[i][j])
                    return false;

        return true;
    }

    ~Matrix() {

        for(int i=0;i<rows;i++)
            delete[] mat[i];

        delete[] mat;

        cout<<"Matrix memory deallocated\n";
    }
};

int main() {

    Matrix m1, m2, m3;

    cin >> m1 >> m2;

    cout<<"\nMatrix 1:\n"<<m1;
    cout<<"\nMatrix 2:\n"<<m2;

    m3 = m1 + m2;

    cout<<"\nMatrix Addition Result:\n"<<m3;

    if(m1 == m2)
        cout<<"\nMatrices are Equal\n";
    else
        cout<<"\nMatrices are Not Equal\n";

    return 0;
}
