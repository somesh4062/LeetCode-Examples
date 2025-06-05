//Array Sorting Explained - stepwise 

#include <iostream>
using namespace std;

int main() {
    // Array Reverse
    int arr[] = {1,10,21,43,67,6};
    int len = sizeof(arr)/sizeof(arr[0]);
    int temp;
    for (int i=0;i<len;i++)
    {
        for(int j=i+1;j<len;j++)
        {
            cout<<arr[i]<<" "<<arr[j]<<"\n";
            if (arr[i]>arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                cout<<"Swapped: "<<arr[i]<<" "<<arr[j]<<"\n";
            }
        }
    }
    int i=0;
    while(i<len)
    {
        cout<<arr[i]<<" ";
        i++;
    }
    return 0;
}
