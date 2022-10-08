import collections

WHITE, BLACK = range(2)

Coordinate = collections.namedtuple('Coordinate', ('x', 'y'))


def search_maze(maze, s, e):
    def search_maze_helper(cur):
        if not (0 <= cur.x < len(maze) and 0 <= cur.y < len(maze[cur.x]) and maze[cur.x][cur.y] == WHITE):
            return False
        path.append(cur)
        maze[cur.x][cur.y] = BLACK
        if cur == e:
            return True
