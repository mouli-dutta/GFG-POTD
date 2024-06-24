# https://www.geeksforgeeks.org/problems/left-rotate-matrix-k-times2351/1
# You are given an integer k and matrix mat. Return a matrix where it is rotated Left k times.


class Solution:
    def rotateMatrix(self, k, mat):
        # code here
        def shift_row_left(row, k):
            n = len(row)
            k = k % n  # To handle cases where k > n
            return row[k:] + row[:k]
        
        return [shift_row_left(row, k) for row in mat]

