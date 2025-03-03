function solution(brown, yellow) {
    var answer = [];
    var total = brown + yellow;
    var row = 0;
    var col = 0;
    for(var i = 1; i<total ; i++){
        col = i;
        if(total%col == 0 && total/col >= col){
            row = total/col;
            console.log(row, col);
            if((row - 2) * (col - 2) == yellow){
                answer = [row, col]
            }
        }
    }
    return answer;
}