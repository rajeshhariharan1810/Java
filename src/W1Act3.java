void main() {
    LocalDate date = LocalDate.now();
    LocalDate newDate = date.plusDays(100);

    IO.println(date);
    IO.println(newDate);
}
