const graph = {
    A: ["B", "C"],
    B: ["A", "D"],
    C: ["A", "G", "H", "I"],
    D: ["B", "E", "F"],
    E: ["D"],
    F: ["D"],
    G: ["C"],
    H: ["C"],
    I: ["C", "J"],
    J: ["I"]
};

const DFS = (graph, start) => {
    const visited= []; // 탐색을 마친 노드들
    let needVisit = []; //탐색해야할 노드들
    
    needVisit.push(start); // 노드 탐색 시작
    while(needVisit.length !== 0) {
        const node = needVisit.shift(); // queue이기 때문에 선입 선출,shift() 사용
               
        if(!visited.includes(node)) { // 방문한적이 없다면
            visited.push(node); // 방문처리
            needVisit = [...graph[node], ...needVisit];
        }
    }
    return visited;
}