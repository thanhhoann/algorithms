const pigeonhole_sort = (nums) => {
  const holes = [];

  nums.forEach((num) => {
    if (holes[num]) holes[num].push(num);
    else holes[num] = [num];
  });

  return holes.reduce((a, b) => a.concat(b), []);
};

console.log(pigeonhole_sort([1, 4, 9, 3, 8, 10, 2, 3, 4, 19]));
