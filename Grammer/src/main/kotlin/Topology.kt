package org.example

    fun main() {
        // 예제 그래프:
        // 1 -> 2, 1 -> 3, 2 -> 4, 3 -> 4, 4 -> 5
        val graph = mapOf(
            1 to listOf(2, 3),
            2 to listOf(4),
            3 to listOf(4),
            4 to listOf(5),
            5 to listOf() // 5는 후행 노드가 없습니다.
        )

        try {
            val sortedOrder = topology(graph)
            println("위상정렬 결과: $sortedOrder")
            // 예상 출력: 위상정렬 결과: [1, 2, 3, 4, 5] 또는 [1, 3, 2, 4, 5]
            // (노드 2와 3의 순서는 상호간에 의존성이 없으므로 결과가 달라질 수 있습니다.)
        } catch (e: Exception) {
            println("오류 발생: ${e.message}")
        }
    }
    fun topology(graph: Map<Int, List<Int>>): List<Int> {
        //진입차수에 대한 map을 만들어서 초기화 해주는 과정을 거친다. => 먼저 node별
        val inDegree = mutableMapOf<Int,Int>()

        for ((node, neighbors) in graph) {
            inDegree[node] = 0
            for(neighbor in neighbors) {
                inDegree[neighbor] = inDegree.getOrDefault(neighbor, 0) + 1
            }
        }
        //graph를 돌면서 진입차수를 더해준다.

        val queue = ArrayDeque<Int>();
        // 진입차수가 0인 노드를 queue에 넣어준다.
        for ((node, degree) in inDegree) {
            if(degree == 0) {
                queue.add(node)
            }
        }
        //queue가 빌때까지 while문을 돌면서 queue에서 하나씩 꺼내서 sortedTopologyList에 넣어주고, 그 다음에 연결된 노드들을 돌면서 진입 차수를 하나씩 빼준다.
        val sortedTopologyList = mutableListOf<Int>()
        while (queue.isNotEmpty()) { //empty일때까지 계속 돌려준다
            val current = queue.removeFirst() //첫번쨰 꺼를 빼준다.
            sortedTopologyList.add(current)
            //Not nullable value required to call an 'iterator()' method on for-loop range => iterator를 돌릴 때는 nullable이 아니어야 한다.
            for (neighbor in graph.get(current) ?: emptyList()) {
                inDegree[neighbor] = inDegree[neighbor]!! - 1
                if(inDegree[neighbor] == 0) {
                    queue.add(neighbor)
                }

            }

        }
        return sortedTopologyList
        // 이후 진입차수가 0이 된것들은 다시 한번 더 queue에 넣어준다.
    }