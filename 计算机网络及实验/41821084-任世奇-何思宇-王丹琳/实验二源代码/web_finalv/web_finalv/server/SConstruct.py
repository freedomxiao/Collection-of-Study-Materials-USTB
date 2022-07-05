
src = Glob('*.cpp')
 
paths = ['./']
paths += ['../http']
paths += ['../lib']
paths += ['../log']
paths += ['../tbtree']
 
env = Environment ()  
env.Append(CPPPATH=paths)
env.Append(CCCOMSTR="CC $SOURCES")
env.Append(LINKCOMSTR="LINK $TARGET")
 
objs = SConscript('../http/SConscript.py',variant_dir='build/http', duplicate=0)
objs += SConscript('../lib/SConscript.py',variant_dir='build/lib', duplicate=0)
objs += SConscript('../log/SConscript.py',variant_dir='build/log', duplicate=0)
objs += SConscript('../rbtree/SConscript.py',variant_dir='build/tbtree', duplicate=0)

objs += env.Object(src)
 
env.Program(target = 'web',source=objs)
