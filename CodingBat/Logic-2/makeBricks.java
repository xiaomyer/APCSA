// public boolean makeBricks(int small, int big, int goal) {
//     // first check if total possible number of bricks is enough to make the row
//     int totalPossible = (small * 1) + (big * 5);
//     if (totalPossible - goal < 0) return false;
//     int bigsNeeded = goal / 5;
//     return goal - (bigsNeeded * 5) <= small; // returns true if the number of inches remaining after all big bricks that can be used are used is less than the number of small bricks
// }