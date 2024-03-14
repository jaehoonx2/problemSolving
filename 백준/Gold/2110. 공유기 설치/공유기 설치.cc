#include <stdio.h>
#include <stdlib.h>

int n, k;

void merge(int arr[], int l, int m, int r) { 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
  
    int L[n1], R[n2]; 
  
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i];

    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1+ j]; 
  
    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2) { 
        if (L[i] <= R[j]) { 
            arr[k] = L[i]; 
            i++; 
        } else { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    while (i < n1) { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

    while (j < n2) { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
  
void mergeSort(int arr[], int l, int r) { 
    if (l < r) { 
        int m = l+(r-l)/2; 

        mergeSort(arr, l, m); 
        mergeSort(arr, m+1, r); 
        merge(arr, l, m, r); 
    } 
}

int solve(int pole[]) {
    // 가능한 최소 거리의 상하한
    int lower = 1;
    int upper = pole[n-1] - pole[0];

    int maxDiff;

    while(lower <= upper) {
        int mid = (lower + upper) / 2;  // 이상적인 간격
        int prevAmp = pole[0];          // 바로 직전에 설치한 증폭기, 첫번째에다 무조건 박고 시작함
        int ampCount = 1;               // 설치된 증폭기 갯수

        // 첫번째 전봇대에는 이미 박았다고 생각했으니 1부터 시작
        for(int i = 1; i < n; i++) {
            int diff = pole[i] - prevAmp;
            // 직전 증폭기와의 거리 차이가 mid보다 크거나 같으면 무조건 증폭기 설치
            if (diff >= mid) {
                ampCount++;
                prevAmp = pole[i];
            }
        }

        // 설치한 증폭기 갯수가 k보다 크거나  당연히 증폭기 수 줄여야 함
        // 증폭기 간격을 넓혀야!
        if(k <= ampCount) {
            maxDiff = mid;
            lower = mid + 1;
        } else {
            // 반대로 설치한 갯수가 작으면 줄여야
            upper = mid - 1;
        }
    }

    return maxDiff;
} 

int main(void) {
    scanf("%d %d", &n, &k);

    int * pole = (int *) malloc(sizeof(int)*n);

    for(int i = 0; i < n; i++)
        scanf("%d", pole+i);

    mergeSort(pole, 0, n-1);

    printf("%d", solve(pole));

    free(pole);

    return 0;
}