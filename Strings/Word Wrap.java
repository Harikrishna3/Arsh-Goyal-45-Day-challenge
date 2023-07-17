class Solution
    {
        public int solveWordWrap (int[] nums, int k)
        {
            int n = nums.length;
            // Creating a DP array of constrainsts given 
            int dp[][] = new int[n+1][k+1];
            
            // Initializing DP array with all values as -1
            for (int i=0;i<=n;i++){
                for (int j=0;j<=k;j++){
                    dp[i][j] = -1;
                }
            }
            
            // Recursion + Memoization
            int ans = Helper(0,k,nums,k,dp);
            return ans;
        }
        
        public int Helper(int idx, int rem, int[] arr, int k, int dp[][]){
            
            // Base Case 1 : If we are at the last line, return 0 as spaces left
            // (As given in the question)
            if (idx==arr.length) return 0;
            // Base Case 2 : If we have already calculated the value, return it
            if (dp[idx][rem] != -1) return dp[idx][rem];
            
            int includeInSameLine = Integer.MAX_VALUE;
            
            
            // If the current word can fit in the same line
            if (arr[idx] < rem){
                includeInSameLine = Helper(idx+1, rem-arr[idx]-1, arr,k,dp);
            }
            
            // If the current word exactly fits in the remaining space of the line
            else if (arr[idx] == rem){
                includeInSameLine = Helper(idx+1,k,arr,k,dp);
            }
            
            
            // Calculate cost of including current word in the next line
            int includeInNextLine = ((rem+1)*(rem+1)) + Helper(idx+1, k-arr[idx]-1,arr,k,dp);
            
            // Fill DP array and return the minimum value
            return dp[idx][rem] = Math.min(includeInSameLine, includeInNextLine);
        }
    }