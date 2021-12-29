const bubble_sort = (nums) => {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] >= nums[j]) {
        [nums[i], nums[j]] = [nums[j], nums[i]];
      }
    }
  }
  return nums;
};

console.log(bubble_sort([1, 4, 9, 3, 8, 10, 2, 3, 4, 19]));
