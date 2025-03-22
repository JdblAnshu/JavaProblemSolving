public class FindUnion {
	//https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
}
/*
class TUF{
static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
  HashMap <Integer,Integer > freq=new HashMap<>();
  ArrayList<Integer> Union=new ArrayList<>();
  for (int i = 0; i < n; i++)
    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);

  for (int i = 0; i < m; i++)
    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
  for (int it: freq.keySet())
    Union.add(it);
  return Union;
}
 */

//ro use set and Insert