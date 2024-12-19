def solution(num_list):
    answer = 0
    length = len(num_list)
    if length < 11 :
        answer = 1
        for i in range(length):
            answer *= num_list[i]
    else :
        for i in range(length):
            answer += num_list[i]
    return answer