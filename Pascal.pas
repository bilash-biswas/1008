var
    a : int64;
    b : int64;
    c : double;
    x : double;

begin
    read(a);
    read(b);
    read(c);
    x := b * c;
    writeln('NUMBER = ', a);
    writeln('SALARY = U$ ', x:-1:2);
end.
