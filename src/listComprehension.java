void main() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> squares = numbers.stream()
            .filter(num -> num % 2 == 0)
            .map(num -> num * num)
            .toList();
    System.out.println(squares);
}
