package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MeetingRoomsTest {

    private MeetingRooms meetingRooms = new MeetingRooms();

    @Test
    public void test_meeting_room_1(){
        int[][] intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        int rooms = meetingRooms.minMeetingRooms(intervals);
        Assert.assertEquals(2, rooms);
    }
}
