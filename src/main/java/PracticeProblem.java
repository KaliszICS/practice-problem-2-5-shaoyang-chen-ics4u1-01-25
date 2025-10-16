public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void insertionSort(char[] array) {
		for (int i = 1; i < array.length; i++) {
			char temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp) {
				//
//          _____
//      _-~~     ~~-_//
//    /~             ~\
//   |              _  |_
//  |         _--~~~ )~~ )___
// \|        /   ___   _-~   ~-_
// \          _-~   ~-_         \
// |         /         \         |
// |        |           |     (O  |
//  |      |             |        |
//  |      |   O)        |       |
//  /|      |           |       /
//  / \ _--_ \         /-_   _-~)
//    /~    \ ~-_   _-~   ~~~__/
//   |   |\  ~-_ ~~~ _-~~---~  \
//   |   | |    ~--~~  / \      ~-_
//    |   \ |                      ~-_
//     \   ~-|                        ~~--__ _-~~-,
//      ~-_   |                             /     |
//         ~~--|                                 /
//           |  |                               /
//           |   |              _            _-~
//           |  /~~--_   __---~~          _-~
//           |  \                   __--~~
//           |  |~~--__     ___---~~
//           |  |      ~~~~~
//           |  |
//
//
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}
	}


}
