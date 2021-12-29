#include <algorithm>
#include <iostream>
#include <iterator>
#include <math.h>
#include <string>
#include <vector>

using namespace std;

#define db(x) cout << #x << " = " << x << endl;

void solve() {
  int A[] = {1, 35, 5, 9, 1, 23, 8, 90, 4, 7, 8, 10, 9};
  int sz = sizeof(A) / sizeof(A[0]);

  int maxNum = 0, minNum = 0;
  for (int i = 0; i < sz; i++) {
    maxNum = max(A[i], maxNum);
    minNum = min(A[i], minNum);
  }

  int range = maxNum - minNum + 1;

  vector<int> holes[range];

  for (int i = 0; i < sz; i++) {
    holes[A[i] - minNum].push_back(A[i]);
  }

  int index = 0;
  for (int i = 0; i < range; i++) {
    vector<int>::iterator it;
    for (it = holes[i].begin(); it != holes[i].end(); ++it) {
      A[index++] = *it;
    }
  }

  for (auto n : A)
    cout << n << " ";
}

int main() {
  vector<int> nums[100];
  int A[] = {1, 4, 5};
  nums.push_back(1);

  for (int i = 0; i < 10; i++) {
    nums[A[i]].push_back(A[i]);
  }

  int index = 0;
  for (int i = 0; i < 10; i++) {
    vector<int>::iterator it;
    for (it = nums[i].begin(); it != nums[i].end(); ++it) {
      A[index++] = *it;
    }
  }

  for (auto n : A) {
    db(n);
  }

  return 0;
}
