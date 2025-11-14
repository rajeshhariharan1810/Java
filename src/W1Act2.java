void main() {
    Random random = new Random();
    List<Integer> randList = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
        randList.add(random.nextInt(100));
    }
    Collections.sort(randList);
    IO.println("Sorted: " + randList);
    int sum = 0;
    for (Integer num : randList) {
        sum += num;
    }
    IO.println("Sum: " + sum);
}
