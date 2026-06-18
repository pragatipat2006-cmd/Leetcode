int maximum69Number(int num) {
    int place = 1000;

    while (place > 0) {
        int digit = (num / place) % 10;

        if (digit == 6) {
            num += 3 * place;
            break;
        }

        place /= 10;
    }

    return num;
}