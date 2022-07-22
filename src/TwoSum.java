import java.util.Map;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //corner case
        if (nums == null || nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[] {map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}

/*
clarification:
    input: nums - array of integers, target - integer
    output: indices - array of integer

assumptions:
    nums -- not null and length >= 2

result:
    x + y = target
    x = target - y --> y is the current value to check whether there is a previous number x such x = target - y
    map<key = int val : value = indice>

   [2,7,11,15]

   high level: iteration -- > check whether the target - current val in map
    case 1: if it is in the map --> return new int[] {i, map.get(target - current val)}
    case 2: if not ---> add current val to the map

test:
 [2,7,11,15], 9
    map<>
    i = 0 --> map<2: 0>
    i = 1 --> 9 - 7 = 2 in map --> return [0, 1]

*/
