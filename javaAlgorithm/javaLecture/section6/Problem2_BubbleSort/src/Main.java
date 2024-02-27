public class Main {
  private void bubbleSort(int[] arr, int n) {
    for (int i = 0; i < n-1; i++) { // 하나 적게 돌아도 된다는데?
      for (int j = 0; j < n - i -1 ; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j + 1] = tmp;
        }
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}