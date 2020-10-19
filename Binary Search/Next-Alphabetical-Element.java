class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0, r=letters.length;
        char result=letters[0];
        if(target > letters[letters.length - 1]) 
             return letters[0];
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(letters[mid]==target)
            {
                if(mid+1< letters.length-1) l=mid+1;
                if(mid==letters.length-1) return letters[0];
            }
            else if(letters[mid] < target)
            {
                l=mid+1;
            }
            
            else if(letters[mid]>target)
            {
                result = letters[mid];
                r=mid-1;
            }
        }
        return result;
    }
}
