"""
dependecy injection: one object supply dependencies to another object, 
allowing decoupling between objects.
library: dependency_injector
source: dev.to
"""

import sys
from dependency_injector import containers, providers
from dependency_injector.wiring import inject, Provide


class School:

    def __init__(self, name: str, city: str, board: str):
        self.schoolname = name
        self.city = city
        self.board = board

    def get_schoolname(self):
        print(f"school name is {self.schoolname}")


class Student():

    def __init__(self, name: str, age: int, grade: int, school: School):
        self.name = name
        self.age = age
        self.grade = grade
        self.school = school

    def get_students(self):
        student_detail = f"""
            Student Name: {self.name}
            Student Age: {self.age}
            Student Grade: {self.grade}
            School: {self.school.schoolname}
            Exam Board: {self.school.board}
            City: {self.school.city}
        """

        print(student_detail)


class Container(containers.DeclarativeContainer):
    school = providers.Factory(
        School,
        "Work Right Fast",
        "Lola",
        "F.L.O.W"
    )

    student = providers.Factory(
        Student,
        "Mbongo",
        21,
        10,
        school
    )


def main():
    student = Container.student()
    student.get_students()


if __name__ == "__main__":
    container = Container()
    container.wire(modules=[sys.modules[__name__]])
    main()
