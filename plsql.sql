DO $$
DECLARE
    num INT := 10;
BEGIN
    IF num % 2 = 0 THEN
        RAISE NOTICE '% is Even', num;
    ELSE
        RAISE NOTICE '% is Odd', num;
    END IF;
END $$;
DO $$
DECLARE
    a INT := 10;
    b INT := 25;
    c INT := 18;
BEGIN
    IF a >= b AND a >= c THEN
        RAISE NOTICE 'Greatest = %', a;
    ELSIF b >= a AND b >= c THEN
        RAISE NOTICE 'Greatest = %', b;
    ELSE
        RAISE NOTICE 'Greatest = %', c;
    END IF;
END $$;
DO $$
DECLARE
    age INT := 20;
BEGIN
    IF age >= 18 THEN
        RAISE NOTICE 'Eligible for Voting';
    ELSE
        RAISE NOTICE 'Not Eligible for Voting';
    END IF;
END $$;
DO $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..10 LOOP
        RAISE NOTICE '%', i;
    END LOOP;
END $$;
DO $$
DECLARE
    i INT;
    total INT := 0;
BEGIN
    FOR i IN 1..10 LOOP
        total := total + i;
    END LOOP;

    RAISE NOTICE 'Sum = %', total;
END $$;
DO $$
DECLARE
    num INT := 5;
    i INT;
BEGIN
    FOR i IN 1..10 LOOP
        RAISE NOTICE '% x % = %', num, i, num*i;
    END LOOP;
END $$;
DO $$
DECLARE
    n INT := 5;
    fact INT := 1;
    i INT;
BEGIN
    FOR i IN 1..n LOOP
        fact := fact * i;
    END LOOP;

    RAISE NOTICE 'Factorial = %', fact;
END $$;
DO $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..20 LOOP
        IF i % 2 = 0 THEN
            RAISE NOTICE '%', i;
        END IF;
    END LOOP;
END $$;
DO $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..20 LOOP
        IF i % 2 <> 0 THEN
            RAISE NOTICE '%', i;
        END IF;
    END LOOP;
END $$;