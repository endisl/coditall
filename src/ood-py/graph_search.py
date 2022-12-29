class GraphSearch:

    def __init__(self, graph):
        self.graph = graph

    def find_path_dfs(self, start, end, path=None):
        path = path or []

        path.append(start)
        if start == end:
            return path

        for node in self.graph.get(start, []):
            if node not in path:
                newpath = self.find_path_dfs(node, end, path[:])
                if newpath:
                    return newpath

    def find_all_path_dfs(self, start, end, path=None):
        path = path or []

        path.append(start)
        if start == end:
            return [path]

        paths = []
        for node in self.graph.get(start, []):
            if node not in path:
                newpaths = self.find_all_path_dfs(node, end, path[:])
                paths.extend(newpaths)
        return paths

    def find_shortest_path_dfs(self, start, end, path=None):
        path = path or []

        path.append(start)
        if start == end:
            return path

        shortest = None
        for node in self.graph.get(start, []):
            if node not in path:
                newpath = self.find_shortest_path_dfs(node, end, path[:])
                if newpath:
                    if not shortest or len(newpath) < len(shortest):
                        shortest = newpath
        return shortest

    def find_shortest_path_bfs(self, start, end, path=None):
        queue = [start]
        dist_to = {start: 0}
        edge_to = {}

        if start == end:
            return queue

        while len(queue):
            value = queue.pop(0)
            for node in self.graph[value]:
                if node not in dist_to.keys():
                    edge_to[node] = value
                    dist_to[node] = dist_to[value] + 1
                    queue.append(node)
                    if end in edge_to.keys():
                        path = []
                        node = end
                        while dist_to[node] != 0:
                            path.insert(0, node)
                            node = edge_to[node]
                        path.insert(0, start)
                        return path
