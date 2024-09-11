import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int position = timeToSeconds(pos);
        int opStart = timeToSeconds(op_start);
        int opEnd = timeToSeconds(op_end);

        if (position >= opStart && position <= opEnd) {
            position = opEnd;
        }

        for (String command : commands) {
            if (command.equals("next")) {
                position = Math.min(position + 10, videoLength); // 10초 후로 이동
            } else if (command.equals("prev")) {
                position = Math.max(position - 10, 0); // 10초 전으로 이동
            }

            // 오프닝 구간에 있다면 op_end로 이동
            if (position >= opStart && position <= opEnd) {
                position = opEnd;
            }
        }

        return secondsToTime(position);
    }

    // "mm:ss"를 초 단위로 변환
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // 초 단위를 "mm:ss" 형식으로 변환
    private String secondsToTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}