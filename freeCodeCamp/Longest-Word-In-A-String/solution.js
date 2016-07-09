function findLongestWord(string) {
    var str = string.split(" ");
    var longest = 0;
    var word = null;
    for (var i = 0; i < str.length; i++) {
        if (longest < str[i].length) {
            longest = str[i].length;
            word = str[i];
            word = word.length;
        }
    }
    return word;
}

findLongestWord("The quick brown fox jumped over the lazy dog");
