/*
 * BEST_CASE: when the list is already or nearly sorted => O(n)
 * AVERAGE_CASE: O(n)
 * WORST_CASE: when the smallest element is in the last position => O(n^2)
 */

#include <algorithm>
#include <iostream>
#include <math.h>
#include <string>
#include <vector>

using namespace std;

#define ll long long

#define db(x) cout << #x << " = " << x << endl;

void solve() {
  int A[] = {1, 5, 6, 9, 0, 3, 7, 7, 2};

  int sz = sizeof(A) / sizeof(A[0]);

  int count = 0;

  for (int i = 0; i < sz; i++) {
    for (int j = i + 1; j < sz; j++) {
      if (A[i] <= A[j]) {
        swap(A[j], A[i]);
        count++;
      }
    }
  }

  db(count);
  for (int i = 0; i < sz; i++)
    cout << A[i];
}

int main() {
  solve();
  return 0;
}
