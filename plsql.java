CREATE OR REPLACE FUNCTION total_marks(
    m1 NUMBER,
    m2 NUMBER,
    m3 NUMBER
)
RETURN NUMBER
IS
    total NUMBER;
BEGIN
    total := m1 + m2 + m3;
    RETURN total;
END;
/
Step 2: Create Procedure
CREATE OR REPLACE PROCEDURE student_result(
    m1 NUMBER,
    m2 NUMBER,
    m3 NUMBER
)
IS
    total NUMBER;
BEGIN
    total := total_marks(m1, m2, m3);

    DBMS_OUTPUT.PUT_LINE('Total Marks : ' || total);

    IF total >= 150 THEN
        DBMS_OUTPUT.PUT_LINE('Result : PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Result : FAIL');
    END IF;
END;
/
Execute
BEGIN
    student_result(60, 55, 50);
END;
/
Output
Total Marks : 165
Result : PASS
Question 2 – Simple Interest
Step 1: Create Function
CREATE OR REPLACE FUNCTION calc_si(
    p NUMBER,
    r NUMBER,
    t NUMBER
)
RETURN NUMBER
IS
    si NUMBER;
BEGIN
    si := (p * r * t) / 100;
    RETURN si;
END;
/
Step 2: Create Procedure
CREATE OR REPLACE PROCEDURE display_interest(
    p NUMBER,
    r NUMBER,
    t NUMBER
)
IS
    si NUMBER;
    total NUMBER;
BEGIN
    si := calc_si(p, r, t);
    total := p + si;

    DBMS_OUTPUT.PUT_LINE('Principal Amount : ' || p);
    DBMS_OUTPUT.PUT_LINE('Simple Interest  : ' || si);
    DBMS_OUTPUT.PUT_LINE('Total Amount     : ' || total);
END;
/
Execute
BEGIN
    display_interest(10000, 5, 2);
END;
/