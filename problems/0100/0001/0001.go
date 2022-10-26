package problems

func twoSum(nums []int, target int) []int {
	var subs map[int]int = make(map[int]int)
	for i:=0;i<len(nums); i=i+1 {
		if index, ok:=subs[target-nums[i]]; ok{
			return []int{index, i}
		} else {
			subs[nums[i]]=i;
		}
	}
	return nil
}
